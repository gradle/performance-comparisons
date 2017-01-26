package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_394 {
    private final Production58_394 production = new Production58_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}