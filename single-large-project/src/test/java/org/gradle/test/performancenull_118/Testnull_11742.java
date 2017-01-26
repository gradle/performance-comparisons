package org.gradle.test.performancenull_118;

import static org.junit.Assert.*;

public class Testnull_11742 {
    private final Productionnull_11742 production = new Productionnull_11742("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}