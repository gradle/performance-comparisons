package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_136 {
    private final Production58_136 production = new Production58_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}