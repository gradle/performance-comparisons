package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_64 {
    private final Production58_64 production = new Production58_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}