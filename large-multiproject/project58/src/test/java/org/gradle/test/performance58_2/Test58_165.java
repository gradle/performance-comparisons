package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_165 {
    private final Production58_165 production = new Production58_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}