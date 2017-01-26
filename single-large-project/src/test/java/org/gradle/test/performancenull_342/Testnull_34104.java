package org.gradle.test.performancenull_342;

import static org.junit.Assert.*;

public class Testnull_34104 {
    private final Productionnull_34104 production = new Productionnull_34104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}