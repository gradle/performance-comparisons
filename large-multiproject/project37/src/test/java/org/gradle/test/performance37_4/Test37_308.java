package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_308 {
    private final Production37_308 production = new Production37_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}