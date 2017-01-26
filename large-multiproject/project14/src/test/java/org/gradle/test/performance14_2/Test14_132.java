package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_132 {
    private final Production14_132 production = new Production14_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}