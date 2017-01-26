package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_363 {
    private final Production89_363 production = new Production89_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}