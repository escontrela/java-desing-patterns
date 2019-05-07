package com.design.patterns.adapter;

import com.design.patterns.adapter.model.ExternalProduct;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

public class AdapterTest {

    protected Logger logger = LoggerFactory.getLogger(AdapterTest.class);

    @Test
    @DisplayName("Adapt a list of external product to productInfo")
    @Tag("AdapterPattern")
    public void thisTestShouldCreateAListOfAdaptedItems() {

        List<ExternalProduct> marketPlaceProducts = Arrays.asList( new ExternalProduct(BigDecimal.valueOf(1),BigDecimal.valueOf(2),"A","B","1"),
                                                                   new ExternalProduct(BigDecimal.valueOf(1),BigDecimal.valueOf(2),"A","B","2"),
                                                                   new ExternalProduct(BigDecimal.valueOf(1),BigDecimal.valueOf(2),"A","B","3")
                                                                );

        List<ProductInfo> eCommerceProduct
                            = marketPlaceProducts.stream()
                                .map(p -> ProductInfo.adapt(p))
                                    .peek( p-> logger.info("Partnumber: {}" , p.getPartnumber()))
                                .collect(Collectors.toList());


        assertAll("adapter",
                () ->  assertTrue(eCommerceProduct.size() == 3)
        );


    }

}
