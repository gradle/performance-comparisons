package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_307 {
    private final Production48_307 production = new Production48_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}