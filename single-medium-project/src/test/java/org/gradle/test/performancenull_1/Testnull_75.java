package org.gradle.test.performancenull_1;

import static org.junit.Assert.*;

public class Testnull_75 {
    private final Productionnull_75 production = new Productionnull_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}