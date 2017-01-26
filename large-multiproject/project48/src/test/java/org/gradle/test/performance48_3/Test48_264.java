package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_264 {
    private final Production48_264 production = new Production48_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}