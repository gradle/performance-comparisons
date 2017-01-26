package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49205 {
    private final Productionnull_49205 production = new Productionnull_49205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}