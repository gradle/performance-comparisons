package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17497 {
    private final Productionnull_17497 production = new Productionnull_17497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}