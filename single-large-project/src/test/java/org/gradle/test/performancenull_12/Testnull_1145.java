package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1145 {
    private final Productionnull_1145 production = new Productionnull_1145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}