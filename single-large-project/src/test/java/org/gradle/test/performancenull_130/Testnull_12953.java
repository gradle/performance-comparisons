package org.gradle.test.performancenull_130;

import static org.junit.Assert.*;

public class Testnull_12953 {
    private final Productionnull_12953 production = new Productionnull_12953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}