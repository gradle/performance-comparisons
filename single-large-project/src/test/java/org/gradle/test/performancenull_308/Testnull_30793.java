package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30793 {
    private final Productionnull_30793 production = new Productionnull_30793("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}