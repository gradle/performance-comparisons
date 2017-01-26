package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17966 {
    private final Productionnull_17966 production = new Productionnull_17966("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}