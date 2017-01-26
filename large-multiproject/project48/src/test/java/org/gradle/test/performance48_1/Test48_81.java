package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_81 {
    private final Production48_81 production = new Production48_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}