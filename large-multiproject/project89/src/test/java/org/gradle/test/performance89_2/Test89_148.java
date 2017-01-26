package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_148 {
    private final Production89_148 production = new Production89_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}