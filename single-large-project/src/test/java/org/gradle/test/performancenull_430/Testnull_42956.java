package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42956 {
    private final Productionnull_42956 production = new Productionnull_42956("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}