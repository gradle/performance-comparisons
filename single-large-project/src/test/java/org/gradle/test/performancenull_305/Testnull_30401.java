package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30401 {
    private final Productionnull_30401 production = new Productionnull_30401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}