package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_152 {
    private final Production58_152 production = new Production58_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}