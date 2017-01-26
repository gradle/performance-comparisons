package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_308 {
    private final Production4_308 production = new Production4_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}