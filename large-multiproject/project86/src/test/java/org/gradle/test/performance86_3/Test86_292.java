package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_292 {
    private final Production86_292 production = new Production86_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}