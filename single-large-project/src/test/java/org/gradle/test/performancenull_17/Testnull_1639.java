package org.gradle.test.performancenull_17;

import static org.junit.Assert.*;

public class Testnull_1639 {
    private final Productionnull_1639 production = new Productionnull_1639("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}