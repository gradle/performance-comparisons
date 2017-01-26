package org.gradle.test.performancenull_499;

import static org.junit.Assert.*;

public class Testnull_49883 {
    private final Productionnull_49883 production = new Productionnull_49883("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}