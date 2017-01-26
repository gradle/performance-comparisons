package org.gradle.test.performancenull_408;

import static org.junit.Assert.*;

public class Testnull_40798 {
    private final Productionnull_40798 production = new Productionnull_40798("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}