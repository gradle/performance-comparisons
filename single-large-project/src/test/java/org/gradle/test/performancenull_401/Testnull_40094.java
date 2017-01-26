package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40094 {
    private final Productionnull_40094 production = new Productionnull_40094("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}