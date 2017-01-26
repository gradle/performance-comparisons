package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_148 {
    private final Production20_148 production = new Production20_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}