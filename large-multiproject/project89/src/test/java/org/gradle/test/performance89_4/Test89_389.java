package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_389 {
    private final Production89_389 production = new Production89_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}