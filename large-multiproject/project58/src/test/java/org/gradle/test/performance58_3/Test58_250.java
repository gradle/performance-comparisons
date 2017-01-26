package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_250 {
    private final Production58_250 production = new Production58_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}