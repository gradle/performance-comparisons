package org.gradle.test.performancenull_18;

import static org.junit.Assert.*;

public class Testnull_1736 {
    private final Productionnull_1736 production = new Productionnull_1736("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}