package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4009 {
    private final Productionnull_4009 production = new Productionnull_4009("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}