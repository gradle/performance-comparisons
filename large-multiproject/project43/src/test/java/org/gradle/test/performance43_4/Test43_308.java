package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_308 {
    private final Production43_308 production = new Production43_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}