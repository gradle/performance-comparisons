package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_148 {
    private final Production92_148 production = new Production92_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}