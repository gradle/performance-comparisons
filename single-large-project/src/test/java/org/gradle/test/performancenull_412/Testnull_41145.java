package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41145 {
    private final Productionnull_41145 production = new Productionnull_41145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}