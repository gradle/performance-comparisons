package org.gradle.test.performancenull_401;

import static org.junit.Assert.*;

public class Testnull_40069 {
    private final Productionnull_40069 production = new Productionnull_40069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}