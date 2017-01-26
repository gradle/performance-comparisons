package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_244 {
    private final Production89_244 production = new Production89_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}