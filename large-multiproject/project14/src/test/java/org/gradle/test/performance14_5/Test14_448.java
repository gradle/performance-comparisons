package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_448 {
    private final Production14_448 production = new Production14_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}