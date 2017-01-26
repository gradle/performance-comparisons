package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42919 {
    private final Productionnull_42919 production = new Productionnull_42919("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}