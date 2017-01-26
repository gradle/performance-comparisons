package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49902 {
    private final Productionnull_49902 production = new Productionnull_49902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}