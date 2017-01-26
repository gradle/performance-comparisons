package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_355 {
    private final Production14_355 production = new Production14_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}