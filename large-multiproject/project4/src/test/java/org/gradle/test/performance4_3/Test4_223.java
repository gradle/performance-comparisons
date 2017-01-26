package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_223 {
    private final Production4_223 production = new Production4_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}