package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_197 {
    private final Production14_197 production = new Production14_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}