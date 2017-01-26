package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_308 {
    private final Production25_308 production = new Production25_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}