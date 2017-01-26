package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_69 {
    private final Production58_69 production = new Production58_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}