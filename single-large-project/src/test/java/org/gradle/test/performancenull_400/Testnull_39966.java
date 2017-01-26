package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39966 {
    private final Productionnull_39966 production = new Productionnull_39966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}