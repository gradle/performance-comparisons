package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_250 {
    private final Production89_250 production = new Production89_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}