package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42838 {
    private final Productionnull_42838 production = new Productionnull_42838("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}