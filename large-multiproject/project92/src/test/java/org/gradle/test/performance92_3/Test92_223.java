package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_223 {
    private final Production92_223 production = new Production92_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}