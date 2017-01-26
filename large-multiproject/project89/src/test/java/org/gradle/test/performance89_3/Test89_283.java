package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_283 {
    private final Production89_283 production = new Production89_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}