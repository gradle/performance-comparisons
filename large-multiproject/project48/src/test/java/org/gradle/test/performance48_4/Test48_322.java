package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_322 {
    private final Production48_322 production = new Production48_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}