package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_223 {
    private final Production89_223 production = new Production89_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}