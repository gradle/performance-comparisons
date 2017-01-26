package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_400 {
    private final Production58_400 production = new Production58_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}