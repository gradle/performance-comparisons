package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34068 {
    private final Productionnull_34068 production = new Productionnull_34068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}