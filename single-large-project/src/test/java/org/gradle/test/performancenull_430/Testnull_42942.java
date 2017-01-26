package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42942 {
    private final Productionnull_42942 production = new Productionnull_42942("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}