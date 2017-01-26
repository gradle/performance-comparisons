package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_391 {
    private final Production14_391 production = new Production14_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}