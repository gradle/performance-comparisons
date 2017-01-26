package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_308 {
    private final Production5_308 production = new Production5_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}