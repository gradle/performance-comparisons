package org.gradle.test.performancenull_499;

import static org.junit.Assert.*;

public class Testnull_49825 {
    private final Productionnull_49825 production = new Productionnull_49825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}