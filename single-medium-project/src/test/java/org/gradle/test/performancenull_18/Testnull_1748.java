package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1748 {
    private final Productionnull_1748 production = new Productionnull_1748("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}