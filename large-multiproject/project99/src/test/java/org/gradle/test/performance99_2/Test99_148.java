package org.gradle.test.performance99_2;

import static org.junit.Assert.*;

public class Test99_148 {
    private final Production99_148 production = new Production99_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}