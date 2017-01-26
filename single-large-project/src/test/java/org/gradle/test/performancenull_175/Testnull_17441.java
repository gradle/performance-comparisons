package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17441 {
    private final Productionnull_17441 production = new Productionnull_17441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}