package org.gradle.test.performancenull_327;

import static org.junit.Assert.*;

public class Testnull_32679 {
    private final Productionnull_32679 production = new Productionnull_32679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}