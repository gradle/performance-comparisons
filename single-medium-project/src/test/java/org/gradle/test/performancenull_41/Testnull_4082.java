package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4082 {
    private final Productionnull_4082 production = new Productionnull_4082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}