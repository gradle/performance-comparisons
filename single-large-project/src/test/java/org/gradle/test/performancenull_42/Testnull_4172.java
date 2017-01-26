package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4172 {
    private final Productionnull_4172 production = new Productionnull_4172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}