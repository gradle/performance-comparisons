package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_158 {
    private final Production48_158 production = new Production48_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}