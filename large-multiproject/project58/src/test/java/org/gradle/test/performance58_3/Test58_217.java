package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_217 {
    private final Production58_217 production = new Production58_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}