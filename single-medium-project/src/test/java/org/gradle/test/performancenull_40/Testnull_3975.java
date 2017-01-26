package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3975 {
    private final Productionnull_3975 production = new Productionnull_3975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}