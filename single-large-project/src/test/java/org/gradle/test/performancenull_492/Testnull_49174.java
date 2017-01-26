package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49174 {
    private final Productionnull_49174 production = new Productionnull_49174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}