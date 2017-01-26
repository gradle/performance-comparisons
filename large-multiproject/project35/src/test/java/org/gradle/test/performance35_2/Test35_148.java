package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_148 {
    private final Production35_148 production = new Production35_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}