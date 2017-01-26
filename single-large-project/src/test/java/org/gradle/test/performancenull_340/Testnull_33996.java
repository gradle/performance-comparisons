package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33996 {
    private final Productionnull_33996 production = new Productionnull_33996("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}