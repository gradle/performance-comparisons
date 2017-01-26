package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_394 {
    private final Production20_394 production = new Production20_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}