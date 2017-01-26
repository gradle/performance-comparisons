package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_124 {
    private final Production58_124 production = new Production58_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}