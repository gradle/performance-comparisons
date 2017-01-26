package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_272 {
    private final Production89_272 production = new Production89_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}