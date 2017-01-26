package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_359 {
    private final Production14_359 production = new Production14_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}