package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_348 {
    private final Production4_348 production = new Production4_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}