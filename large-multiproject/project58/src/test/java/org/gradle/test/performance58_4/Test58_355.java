package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_355 {
    private final Production58_355 production = new Production58_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}