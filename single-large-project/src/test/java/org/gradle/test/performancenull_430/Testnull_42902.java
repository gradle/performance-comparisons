package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42902 {
    private final Productionnull_42902 production = new Productionnull_42902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}