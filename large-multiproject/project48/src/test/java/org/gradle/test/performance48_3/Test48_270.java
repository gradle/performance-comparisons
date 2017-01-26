package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_270 {
    private final Production48_270 production = new Production48_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}