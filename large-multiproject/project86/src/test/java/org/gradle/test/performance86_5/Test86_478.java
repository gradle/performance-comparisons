package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_478 {
    private final Production86_478 production = new Production86_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}