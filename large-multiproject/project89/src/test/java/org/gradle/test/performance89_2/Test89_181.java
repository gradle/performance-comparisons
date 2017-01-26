package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_181 {
    private final Production89_181 production = new Production89_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}