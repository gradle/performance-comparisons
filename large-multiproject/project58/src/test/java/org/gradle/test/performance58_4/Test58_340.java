package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_340 {
    private final Production58_340 production = new Production58_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}