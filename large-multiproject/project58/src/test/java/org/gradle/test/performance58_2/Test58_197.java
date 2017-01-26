package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_197 {
    private final Production58_197 production = new Production58_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}