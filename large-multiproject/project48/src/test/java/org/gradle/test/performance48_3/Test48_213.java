package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_213 {
    private final Production48_213 production = new Production48_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}