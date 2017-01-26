package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_253 {
    private final Production48_253 production = new Production48_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}