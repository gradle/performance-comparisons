package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_177 {
    private final Production58_177 production = new Production58_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}