package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_146 {
    private final Production89_146 production = new Production89_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}