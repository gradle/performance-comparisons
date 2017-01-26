package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_275 {
    private final Production86_275 production = new Production86_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}