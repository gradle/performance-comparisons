package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42898 {
    private final Productionnull_42898 production = new Productionnull_42898("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}