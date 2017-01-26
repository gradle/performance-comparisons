package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_438 {
    private final Production58_438 production = new Production58_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}