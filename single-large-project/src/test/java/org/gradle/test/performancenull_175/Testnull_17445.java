package org.gradle.test.performancenull_175;

import static org.junit.Assert.*;

public class Testnull_17445 {
    private final Productionnull_17445 production = new Productionnull_17445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}