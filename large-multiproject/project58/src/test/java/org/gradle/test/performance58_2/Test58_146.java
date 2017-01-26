package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_146 {
    private final Production58_146 production = new Production58_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}