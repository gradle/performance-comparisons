package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_215 {
    private final Production58_215 production = new Production58_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}