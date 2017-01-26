package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_20 {
    private final Production58_20 production = new Production58_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}