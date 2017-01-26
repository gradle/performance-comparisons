package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_448 {
    private final Production86_448 production = new Production86_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}