package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40057 {
    private final Productionnull_40057 production = new Productionnull_40057("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}