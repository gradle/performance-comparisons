package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_235 {
    private final Production58_235 production = new Production58_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}