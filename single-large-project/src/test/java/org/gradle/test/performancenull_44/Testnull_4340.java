package org.gradle.test.performancenull_44;

import static org.junit.Assert.*;

public class Testnull_4340 {
    private final Productionnull_4340 production = new Productionnull_4340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}