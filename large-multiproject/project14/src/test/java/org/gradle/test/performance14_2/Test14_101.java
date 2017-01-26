package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_101 {
    private final Production14_101 production = new Production14_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}