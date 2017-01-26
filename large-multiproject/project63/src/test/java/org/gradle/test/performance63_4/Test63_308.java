package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_308 {
    private final Production63_308 production = new Production63_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}