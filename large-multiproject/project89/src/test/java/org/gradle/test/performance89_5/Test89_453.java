package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_453 {
    private final Production89_453 production = new Production89_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}