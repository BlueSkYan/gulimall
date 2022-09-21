package xyz.blueskyan.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.blueskyan.gulimall.product.entity.BrandEntity;
import xyz.blueskyan.gulimall.product.service.BrandService;
import xyz.blueskyan.gulimall.product.service.CategoryService;

import java.util.Arrays;

@Slf4j
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Autowired
    private CategoryService categoryService;


    @Test
    public void contextLoads() {
        BrandEntity brand = new BrandEntity();
        brand.setBrandId(1L);
        brand.setDescript("123456");
        brand.setName("ssss666");
        System.out.println(brandService.getOne(new QueryWrapper<BrandEntity>().eq("brand_id",1L)));

    }

    @Test
    public void testFindPath() {
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径：{}",Arrays.asList(catelogPath));
    }
}
