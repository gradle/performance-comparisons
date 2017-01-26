package org.gradle.test.performancenull_4;

import static org.junit.Assert.*;

public class Testnull_330 {
    private final Productionnull_330 production = new Productionnull_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}