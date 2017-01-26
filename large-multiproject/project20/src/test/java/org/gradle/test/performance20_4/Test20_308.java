package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_308 {
    private final Production20_308 production = new Production20_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}