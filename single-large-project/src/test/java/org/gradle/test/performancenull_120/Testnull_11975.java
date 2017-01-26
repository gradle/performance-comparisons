package org.gradle.test.performancenull_120;

import static org.junit.Assert.*;

public class Testnull_11975 {
    private final Productionnull_11975 production = new Productionnull_11975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}