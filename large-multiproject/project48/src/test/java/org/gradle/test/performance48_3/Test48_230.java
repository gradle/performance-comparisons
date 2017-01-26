package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_230 {
    private final Production48_230 production = new Production48_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}