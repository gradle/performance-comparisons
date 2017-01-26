package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_334 {
    private final Production89_334 production = new Production89_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}