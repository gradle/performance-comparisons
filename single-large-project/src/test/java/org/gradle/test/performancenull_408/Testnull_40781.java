package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40781 {
    private final Productionnull_40781 production = new Productionnull_40781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}