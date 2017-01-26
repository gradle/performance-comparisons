package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_308 {
    private final Production14_308 production = new Production14_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}