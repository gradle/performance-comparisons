package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_129 {
    private final Production89_129 production = new Production89_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}