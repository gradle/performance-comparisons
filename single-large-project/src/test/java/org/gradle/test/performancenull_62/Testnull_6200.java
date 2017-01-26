package org.gradle.test.performancenull_62;

import static org.junit.Assert.*;

public class Testnull_6200 {
    private final Productionnull_6200 production = new Productionnull_6200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}