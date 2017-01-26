package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_252 {
    private final Production58_252 production = new Production58_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}