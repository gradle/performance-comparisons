package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_381 {
    private final Production89_381 production = new Production89_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}