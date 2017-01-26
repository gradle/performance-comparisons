package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5403 {
    private final Productionnull_5403 production = new Productionnull_5403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}