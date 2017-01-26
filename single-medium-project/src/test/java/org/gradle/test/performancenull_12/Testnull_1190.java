package org.gradle.test.performancenull_12;

import static org.junit.Assert.*;

public class Testnull_1190 {
    private final Productionnull_1190 production = new Productionnull_1190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}