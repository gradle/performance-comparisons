package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1698 {
    private final Productionnull_1698 production = new Productionnull_1698("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}