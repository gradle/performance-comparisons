package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_244 {
    private final Production48_244 production = new Production48_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}