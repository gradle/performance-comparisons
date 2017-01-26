package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_142 {
    private final Production89_142 production = new Production89_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}