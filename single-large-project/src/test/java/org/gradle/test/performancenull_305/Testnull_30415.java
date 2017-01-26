package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30415 {
    private final Productionnull_30415 production = new Productionnull_30415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}