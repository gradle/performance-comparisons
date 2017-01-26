package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_217 {
    private final Production48_217 production = new Production48_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}