package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_394 {
    private final Production5_394 production = new Production5_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}