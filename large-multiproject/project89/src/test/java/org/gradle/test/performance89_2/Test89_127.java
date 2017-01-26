package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_127 {
    private final Production89_127 production = new Production89_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}