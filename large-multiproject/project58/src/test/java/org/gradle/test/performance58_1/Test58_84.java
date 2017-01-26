package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_84 {
    private final Production58_84 production = new Production58_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}