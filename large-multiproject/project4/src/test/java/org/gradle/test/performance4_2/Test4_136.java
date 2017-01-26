package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_136 {
    private final Production4_136 production = new Production4_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}