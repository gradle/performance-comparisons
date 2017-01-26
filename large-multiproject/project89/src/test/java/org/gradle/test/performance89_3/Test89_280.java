package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_280 {
    private final Production89_280 production = new Production89_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}