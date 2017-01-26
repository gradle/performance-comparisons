package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_180 {
    private final Production48_180 production = new Production48_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}