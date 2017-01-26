package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_371 {
    private final Production48_371 production = new Production48_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}