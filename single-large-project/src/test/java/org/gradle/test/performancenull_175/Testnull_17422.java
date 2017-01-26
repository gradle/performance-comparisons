package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17422 {
    private final Productionnull_17422 production = new Productionnull_17422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}