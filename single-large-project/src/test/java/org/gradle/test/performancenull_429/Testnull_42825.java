package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42825 {
    private final Productionnull_42825 production = new Productionnull_42825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}