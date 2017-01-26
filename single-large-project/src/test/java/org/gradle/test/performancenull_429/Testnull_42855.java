package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42855 {
    private final Productionnull_42855 production = new Productionnull_42855("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}