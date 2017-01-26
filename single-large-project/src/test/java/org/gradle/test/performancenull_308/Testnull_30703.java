package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30703 {
    private final Productionnull_30703 production = new Productionnull_30703("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}