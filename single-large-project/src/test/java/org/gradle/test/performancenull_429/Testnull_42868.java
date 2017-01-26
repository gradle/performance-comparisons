package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42868 {
    private final Productionnull_42868 production = new Productionnull_42868("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}