package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_215 {
    private final Production48_215 production = new Production48_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}