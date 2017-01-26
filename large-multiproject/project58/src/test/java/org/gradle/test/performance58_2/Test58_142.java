package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_142 {
    private final Production58_142 production = new Production58_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}