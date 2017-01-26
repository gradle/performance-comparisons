package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_79 {
    private final Production58_79 production = new Production58_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}