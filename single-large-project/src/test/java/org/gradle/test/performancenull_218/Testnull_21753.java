package org.gradle.test.performancenull_218;

import static org.junit.Assert.*;

public class Testnull_21753 {
    private final Productionnull_21753 production = new Productionnull_21753("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}