package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_137 {
    private final Production58_137 production = new Production58_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}