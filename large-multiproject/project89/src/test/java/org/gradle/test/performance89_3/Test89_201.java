package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_201 {
    private final Production89_201 production = new Production89_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}