package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_440 {
    private final Production48_440 production = new Production48_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}