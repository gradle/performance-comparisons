package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_443 {
    private final Production86_443 production = new Production86_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}