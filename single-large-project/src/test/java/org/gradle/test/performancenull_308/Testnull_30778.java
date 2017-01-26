package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30778 {
    private final Productionnull_30778 production = new Productionnull_30778("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}