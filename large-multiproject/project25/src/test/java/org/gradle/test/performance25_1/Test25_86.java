package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_86 {
    private final Production25_86 production = new Production25_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}