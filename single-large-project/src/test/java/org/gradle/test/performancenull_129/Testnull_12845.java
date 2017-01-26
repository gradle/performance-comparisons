package org.gradle.test.performancenull_129;

import static org.junit.Assert.*;

public class Testnull_12845 {
    private final Productionnull_12845 production = new Productionnull_12845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}