package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21824 {
    private final Productionnull_21824 production = new Productionnull_21824("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}