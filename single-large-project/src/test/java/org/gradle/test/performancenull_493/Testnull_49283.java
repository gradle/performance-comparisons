package org.gradle.test.performancenull_493;

import static org.junit.Assert.*;

public class Testnull_49283 {
    private final Productionnull_49283 production = new Productionnull_49283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}