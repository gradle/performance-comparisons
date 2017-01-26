package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_308 {
    private final Production92_308 production = new Production92_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}