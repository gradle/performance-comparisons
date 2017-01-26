package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42824 {
    private final Productionnull_42824 production = new Productionnull_42824("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}