package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_340 {
    private final Production89_340 production = new Production89_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}