package org.gradle.test.performancenull_104;

import static org.junit.Assert.*;

public class Testnull_10386 {
    private final Productionnull_10386 production = new Productionnull_10386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}