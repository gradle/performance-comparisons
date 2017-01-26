package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_335 {
    private final Production14_335 production = new Production14_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}