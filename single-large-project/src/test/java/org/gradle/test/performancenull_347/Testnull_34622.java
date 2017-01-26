package org.gradle.test.performancenull_347;

import static org.junit.Assert.*;

public class Testnull_34622 {
    private final Productionnull_34622 production = new Productionnull_34622("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}