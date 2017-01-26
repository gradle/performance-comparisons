package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49924 {
    private final Productionnull_49924 production = new Productionnull_49924("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}