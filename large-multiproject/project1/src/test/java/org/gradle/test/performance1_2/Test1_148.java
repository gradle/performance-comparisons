package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_148 {
    private final Production1_148 production = new Production1_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}