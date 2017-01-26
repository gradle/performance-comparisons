package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42978 {
    private final Productionnull_42978 production = new Productionnull_42978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}