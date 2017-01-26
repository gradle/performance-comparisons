package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_483 {
    private final Production89_483 production = new Production89_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}