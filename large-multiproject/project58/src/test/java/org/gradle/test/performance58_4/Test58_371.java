package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_371 {
    private final Production58_371 production = new Production58_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}