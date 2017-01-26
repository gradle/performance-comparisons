package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30241 {
    private final Productionnull_30241 production = new Productionnull_30241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}