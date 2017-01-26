package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_150 {
    private final Production89_150 production = new Production89_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}