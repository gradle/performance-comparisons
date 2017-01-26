package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39975 {
    private final Productionnull_39975 production = new Productionnull_39975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}