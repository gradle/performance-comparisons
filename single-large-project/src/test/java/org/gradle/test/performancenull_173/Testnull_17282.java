package org.gradle.test.performancenull_173;

import static org.junit.Assert.*;

public class Testnull_17282 {
    private final Productionnull_17282 production = new Productionnull_17282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}