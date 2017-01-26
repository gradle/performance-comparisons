package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4168 {
    private final Productionnull_4168 production = new Productionnull_4168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}