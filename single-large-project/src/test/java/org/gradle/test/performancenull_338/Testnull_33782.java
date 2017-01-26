package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33782 {
    private final Productionnull_33782 production = new Productionnull_33782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}