package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_176 {
    private final Production89_176 production = new Production89_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}