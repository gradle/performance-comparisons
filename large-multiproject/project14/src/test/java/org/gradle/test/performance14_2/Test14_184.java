package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_184 {
    private final Production14_184 production = new Production14_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}