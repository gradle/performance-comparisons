package org.gradle.test.performancenull_240;

import static org.junit.Assert.*;

public class Testnull_23975 {
    private final Productionnull_23975 production = new Productionnull_23975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}