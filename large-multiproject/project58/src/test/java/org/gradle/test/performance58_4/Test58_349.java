package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_349 {
    private final Production58_349 production = new Production58_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}