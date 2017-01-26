package org.gradle.test.performancenull_161;

import static org.junit.Assert.*;

public class Testnull_16078 {
    private final Productionnull_16078 production = new Productionnull_16078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}