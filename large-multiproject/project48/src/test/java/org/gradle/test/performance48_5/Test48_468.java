package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_468 {
    private final Production48_468 production = new Production48_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}