package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_190 {
    private final Production89_190 production = new Production89_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}