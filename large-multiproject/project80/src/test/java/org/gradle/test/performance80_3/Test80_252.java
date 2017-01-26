package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_252 {
    private final Production80_252 production = new Production80_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}