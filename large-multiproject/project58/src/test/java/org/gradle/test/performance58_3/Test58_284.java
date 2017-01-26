package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_284 {
    private final Production58_284 production = new Production58_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}