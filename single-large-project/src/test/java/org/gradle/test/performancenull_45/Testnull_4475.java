package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4475 {
    private final Productionnull_4475 production = new Productionnull_4475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}