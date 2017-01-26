package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_459 {
    private final Production89_459 production = new Production89_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}