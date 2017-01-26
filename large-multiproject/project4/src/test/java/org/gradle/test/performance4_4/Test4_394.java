package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_394 {
    private final Production4_394 production = new Production4_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}