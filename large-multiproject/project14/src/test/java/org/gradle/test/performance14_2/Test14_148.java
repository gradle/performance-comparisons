package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_148 {
    private final Production14_148 production = new Production14_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}