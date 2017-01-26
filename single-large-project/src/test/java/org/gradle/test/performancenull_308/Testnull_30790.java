package org.gradle.test.performancenull_308;

import static org.junit.Assert.*;

public class Testnull_30790 {
    private final Productionnull_30790 production = new Productionnull_30790("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}