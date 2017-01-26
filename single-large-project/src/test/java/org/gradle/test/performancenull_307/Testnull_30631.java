package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30631 {
    private final Productionnull_30631 production = new Productionnull_30631("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}