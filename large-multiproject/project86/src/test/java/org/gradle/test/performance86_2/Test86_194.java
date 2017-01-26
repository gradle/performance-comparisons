package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_194 {
    private final Production86_194 production = new Production86_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}