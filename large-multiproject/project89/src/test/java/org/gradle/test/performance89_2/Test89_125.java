package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_125 {
    private final Production89_125 production = new Production89_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}