package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1771 {
    private final Productionnull_1771 production = new Productionnull_1771("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}