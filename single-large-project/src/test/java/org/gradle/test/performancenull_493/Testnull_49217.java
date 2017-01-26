package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49217 {
    private final Productionnull_49217 production = new Productionnull_49217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}