package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_156 {
    private final Production89_156 production = new Production89_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}