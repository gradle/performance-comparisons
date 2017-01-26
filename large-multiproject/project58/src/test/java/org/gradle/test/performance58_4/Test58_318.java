package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_318 {
    private final Production58_318 production = new Production58_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}