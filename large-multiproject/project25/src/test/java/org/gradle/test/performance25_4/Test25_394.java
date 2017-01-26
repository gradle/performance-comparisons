package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_394 {
    private final Production25_394 production = new Production25_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}