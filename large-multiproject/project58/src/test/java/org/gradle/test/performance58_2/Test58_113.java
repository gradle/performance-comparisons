package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_113 {
    private final Production58_113 production = new Production58_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}