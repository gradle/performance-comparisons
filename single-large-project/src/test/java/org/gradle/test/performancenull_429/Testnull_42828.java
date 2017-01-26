package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42828 {
    private final Productionnull_42828 production = new Productionnull_42828("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}