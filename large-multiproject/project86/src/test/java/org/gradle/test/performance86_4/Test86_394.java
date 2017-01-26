package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_394 {
    private final Production86_394 production = new Production86_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}