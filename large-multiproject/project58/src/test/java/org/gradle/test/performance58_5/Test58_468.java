package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_468 {
    private final Production58_468 production = new Production58_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}