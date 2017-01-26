package org.gradle.test.performancenull_2;

import static org.junit.Assert.*;

public class Testnull_168 {
    private final Productionnull_168 production = new Productionnull_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}