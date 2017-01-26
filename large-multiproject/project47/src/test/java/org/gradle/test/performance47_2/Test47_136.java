package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_136 {
    private final Production47_136 production = new Production47_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}