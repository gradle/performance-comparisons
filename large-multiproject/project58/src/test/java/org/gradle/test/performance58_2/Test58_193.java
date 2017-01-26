package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_193 {
    private final Production58_193 production = new Production58_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}