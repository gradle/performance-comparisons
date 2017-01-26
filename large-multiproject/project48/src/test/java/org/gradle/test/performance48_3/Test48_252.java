package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_252 {
    private final Production48_252 production = new Production48_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}