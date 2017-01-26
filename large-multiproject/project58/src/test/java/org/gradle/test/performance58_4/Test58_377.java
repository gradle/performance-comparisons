package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_377 {
    private final Production58_377 production = new Production58_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}