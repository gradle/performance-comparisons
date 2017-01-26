package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_487 {
    private final Production14_487 production = new Production14_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}