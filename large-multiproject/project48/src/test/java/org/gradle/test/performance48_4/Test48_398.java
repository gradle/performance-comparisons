package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_398 {
    private final Production48_398 production = new Production48_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}