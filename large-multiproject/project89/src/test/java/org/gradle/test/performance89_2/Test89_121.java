package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_121 {
    private final Production89_121 production = new Production89_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}