package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_79 {
    private final Production48_79 production = new Production48_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}