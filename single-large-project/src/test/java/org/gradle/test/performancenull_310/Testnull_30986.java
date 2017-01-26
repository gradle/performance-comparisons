package org.gradle.test.performancenull_310;

import static org.junit.Assert.*;

public class Testnull_30986 {
    private final Productionnull_30986 production = new Productionnull_30986("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}