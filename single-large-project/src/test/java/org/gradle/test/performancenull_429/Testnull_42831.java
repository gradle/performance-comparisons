package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42831 {
    private final Productionnull_42831 production = new Productionnull_42831("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}