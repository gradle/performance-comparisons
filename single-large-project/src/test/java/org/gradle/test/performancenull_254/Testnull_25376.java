package org.gradle.test.performancenull_254;

import static org.junit.Assert.*;

public class Testnull_25376 {
    private final Productionnull_25376 production = new Productionnull_25376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}