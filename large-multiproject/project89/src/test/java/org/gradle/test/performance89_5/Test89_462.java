package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_462 {
    private final Production89_462 production = new Production89_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}