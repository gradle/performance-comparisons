package org.gradle.test.performance67_4;

import static org.junit.Assert.*;

public class Test67_394 {
    private final Production67_394 production = new Production67_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}