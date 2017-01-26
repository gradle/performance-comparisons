package org.gradle.test.performancenull_338;

import static org.junit.Assert.*;

public class Testnull_33749 {
    private final Productionnull_33749 production = new Productionnull_33749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}