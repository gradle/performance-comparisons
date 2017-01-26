package org.gradle.test.performancenull_82;

import static org.junit.Assert.*;

public class Testnull_8168 {
    private final Productionnull_8168 production = new Productionnull_8168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}