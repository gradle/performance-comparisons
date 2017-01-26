package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18052 {
    private final Productionnull_18052 production = new Productionnull_18052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}