package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_146 {
    private final Production48_146 production = new Production48_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}