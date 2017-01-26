package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_240 {
    private final Production58_240 production = new Production58_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}