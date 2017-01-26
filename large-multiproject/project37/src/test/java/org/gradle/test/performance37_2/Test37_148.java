package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_148 {
    private final Production37_148 production = new Production37_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}