package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_246 {
    private final Production48_246 production = new Production48_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}