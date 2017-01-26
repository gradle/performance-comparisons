package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_485 {
    private final Production58_485 production = new Production58_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}