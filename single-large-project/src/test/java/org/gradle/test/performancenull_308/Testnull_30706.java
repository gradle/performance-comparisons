package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30706 {
    private final Productionnull_30706 production = new Productionnull_30706("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}