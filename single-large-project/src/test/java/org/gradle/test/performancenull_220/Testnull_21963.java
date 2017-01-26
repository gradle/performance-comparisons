package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21963 {
    private final Productionnull_21963 production = new Productionnull_21963("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}