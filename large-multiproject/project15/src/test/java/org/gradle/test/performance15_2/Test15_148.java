package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_148 {
    private final Production15_148 production = new Production15_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}