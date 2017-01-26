package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_193 {
    private final Production48_193 production = new Production48_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}