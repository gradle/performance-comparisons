package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30709 {
    private final Productionnull_30709 production = new Productionnull_30709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}