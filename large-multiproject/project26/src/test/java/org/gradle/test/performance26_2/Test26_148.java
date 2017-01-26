package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_148 {
    private final Production26_148 production = new Production26_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}