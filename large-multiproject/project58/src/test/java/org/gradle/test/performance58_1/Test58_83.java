package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_83 {
    private final Production58_83 production = new Production58_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}