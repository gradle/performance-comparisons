package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42283 {
    private final Productionnull_42283 production = new Productionnull_42283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}