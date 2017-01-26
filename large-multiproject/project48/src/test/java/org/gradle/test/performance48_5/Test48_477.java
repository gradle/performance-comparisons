package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_477 {
    private final Production48_477 production = new Production48_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}