package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_236 {
    private final Production14_236 production = new Production14_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}