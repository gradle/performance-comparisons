package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40082 {
    private final Productionnull_40082 production = new Productionnull_40082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}