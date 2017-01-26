package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_148 {
    private final Production18_148 production = new Production18_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}