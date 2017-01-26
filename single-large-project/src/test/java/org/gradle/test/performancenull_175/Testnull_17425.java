package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17425 {
    private final Productionnull_17425 production = new Productionnull_17425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}