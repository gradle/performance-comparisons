package org.gradle.test.performancenull_473;

import static org.junit.Assert.*;

public class Testnull_47221 {
    private final Productionnull_47221 production = new Productionnull_47221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}