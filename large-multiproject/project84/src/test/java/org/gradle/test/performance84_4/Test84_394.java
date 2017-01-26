package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_394 {
    private final Production84_394 production = new Production84_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}