package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_308 {
    private final Production99_308 production = new Production99_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}