package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_301 {
    private final Production58_301 production = new Production58_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}