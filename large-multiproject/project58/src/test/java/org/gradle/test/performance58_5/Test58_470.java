package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_470 {
    private final Production58_470 production = new Production58_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}