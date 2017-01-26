package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_312 {
    private final Production58_312 production = new Production58_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}