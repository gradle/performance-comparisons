package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_348 {
    private final Production89_348 production = new Production89_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}