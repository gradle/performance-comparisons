package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42896 {
    private final Productionnull_42896 production = new Productionnull_42896("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}