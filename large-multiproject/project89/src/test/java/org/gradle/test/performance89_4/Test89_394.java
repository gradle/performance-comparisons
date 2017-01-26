package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_394 {
    private final Production89_394 production = new Production89_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}