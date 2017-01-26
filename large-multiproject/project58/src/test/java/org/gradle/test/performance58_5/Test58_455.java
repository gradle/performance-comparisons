package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_455 {
    private final Production58_455 production = new Production58_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}