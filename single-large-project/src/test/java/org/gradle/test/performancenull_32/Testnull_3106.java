package org.gradle.test.performancenull_32;

import static org.junit.Assert.*;

public class Testnull_3106 {
    private final Productionnull_3106 production = new Productionnull_3106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}