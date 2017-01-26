package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_156 {
    private final Production58_156 production = new Production58_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}