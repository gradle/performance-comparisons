package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_438 {
    private final Production89_438 production = new Production89_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}