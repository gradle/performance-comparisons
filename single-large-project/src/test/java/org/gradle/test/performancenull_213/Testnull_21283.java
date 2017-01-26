package org.gradle.test.performancenull_213;

import static org.junit.Assert.*;

public class Testnull_21283 {
    private final Productionnull_21283 production = new Productionnull_21283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}