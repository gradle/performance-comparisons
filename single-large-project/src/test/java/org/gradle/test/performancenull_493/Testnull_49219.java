package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49219 {
    private final Productionnull_49219 production = new Productionnull_49219("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}