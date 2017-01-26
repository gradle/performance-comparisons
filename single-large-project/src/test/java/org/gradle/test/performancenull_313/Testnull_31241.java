package org.gradle.test.performancenull_313;

import static org.junit.Assert.*;

public class Testnull_31241 {
    private final Productionnull_31241 production = new Productionnull_31241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}