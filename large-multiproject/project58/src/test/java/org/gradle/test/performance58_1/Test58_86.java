package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_86 {
    private final Production58_86 production = new Production58_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}