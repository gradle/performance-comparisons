package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_136 {
    private final Production89_136 production = new Production89_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}