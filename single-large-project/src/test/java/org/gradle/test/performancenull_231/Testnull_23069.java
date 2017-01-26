package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23069 {
    private final Productionnull_23069 production = new Productionnull_23069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}