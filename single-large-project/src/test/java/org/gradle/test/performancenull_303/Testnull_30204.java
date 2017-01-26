package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30204 {
    private final Productionnull_30204 production = new Productionnull_30204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}