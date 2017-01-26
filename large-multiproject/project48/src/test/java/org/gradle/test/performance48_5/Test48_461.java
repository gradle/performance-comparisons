package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_461 {
    private final Production48_461 production = new Production48_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}