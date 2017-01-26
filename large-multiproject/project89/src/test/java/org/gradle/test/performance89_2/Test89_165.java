package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_165 {
    private final Production89_165 production = new Production89_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}