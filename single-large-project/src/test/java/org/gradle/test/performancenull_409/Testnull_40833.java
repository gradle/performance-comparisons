package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40833 {
    private final Productionnull_40833 production = new Productionnull_40833("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}