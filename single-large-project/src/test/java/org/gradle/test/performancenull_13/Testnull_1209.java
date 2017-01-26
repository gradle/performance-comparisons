package org.gradle.test.performancenull_13;

import static org.junit.Assert.*;

public class Testnull_1209 {
    private final Productionnull_1209 production = new Productionnull_1209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}