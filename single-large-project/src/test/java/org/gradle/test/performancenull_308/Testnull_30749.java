package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30749 {
    private final Productionnull_30749 production = new Productionnull_30749("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}