package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_94 {
    private final Production58_94 production = new Production58_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}