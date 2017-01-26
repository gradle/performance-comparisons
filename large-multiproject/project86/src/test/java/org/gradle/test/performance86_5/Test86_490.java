package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_490 {
    private final Production86_490 production = new Production86_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}