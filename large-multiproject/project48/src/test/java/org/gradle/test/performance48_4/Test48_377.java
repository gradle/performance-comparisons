package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_377 {
    private final Production48_377 production = new Production48_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}