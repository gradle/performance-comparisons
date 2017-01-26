package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_79 {
    private final Production89_79 production = new Production89_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}