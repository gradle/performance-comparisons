package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_90 {
    private final Production48_90 production = new Production48_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}