package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_137 {
    private final Production48_137 production = new Production48_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}