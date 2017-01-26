package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40024 {
    private final Productionnull_40024 production = new Productionnull_40024("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}