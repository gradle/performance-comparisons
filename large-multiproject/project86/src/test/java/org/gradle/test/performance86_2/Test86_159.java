package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_159 {
    private final Production86_159 production = new Production86_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}