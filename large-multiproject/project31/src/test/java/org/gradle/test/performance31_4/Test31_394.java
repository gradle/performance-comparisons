package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_394 {
    private final Production31_394 production = new Production31_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}