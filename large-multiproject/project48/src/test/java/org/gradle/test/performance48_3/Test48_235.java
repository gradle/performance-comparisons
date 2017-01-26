package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_235 {
    private final Production48_235 production = new Production48_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}