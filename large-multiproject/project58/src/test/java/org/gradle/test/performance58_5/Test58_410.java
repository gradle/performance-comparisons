package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_410 {
    private final Production58_410 production = new Production58_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}