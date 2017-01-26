package org.gradle.test.performancenull_71;

import static org.junit.Assert.*;

public class Testnull_7070 {
    private final Productionnull_7070 production = new Productionnull_7070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}