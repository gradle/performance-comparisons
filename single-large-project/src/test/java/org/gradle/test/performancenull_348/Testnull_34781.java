package org.gradle.test.performancenull_348;

import static org.junit.Assert.*;

public class Testnull_34781 {
    private final Productionnull_34781 production = new Productionnull_34781("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}