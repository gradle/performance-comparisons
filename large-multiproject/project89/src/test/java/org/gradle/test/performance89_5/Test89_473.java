package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_473 {
    private final Production89_473 production = new Production89_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}