package org.gradle.test.performancenull_241;

import static org.junit.Assert.*;

public class Testnull_24003 {
    private final Productionnull_24003 production = new Productionnull_24003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}