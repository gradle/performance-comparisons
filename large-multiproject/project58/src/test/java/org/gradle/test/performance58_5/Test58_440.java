package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_440 {
    private final Production58_440 production = new Production58_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}