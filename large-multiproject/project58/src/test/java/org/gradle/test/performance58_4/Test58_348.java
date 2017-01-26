package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_348 {
    private final Production58_348 production = new Production58_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}