package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_308 {
    private final Production47_308 production = new Production47_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}