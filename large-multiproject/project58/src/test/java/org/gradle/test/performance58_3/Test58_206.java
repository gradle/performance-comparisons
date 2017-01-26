package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_206 {
    private final Production58_206 production = new Production58_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}