package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_186 {
    private final Production48_186 production = new Production48_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}