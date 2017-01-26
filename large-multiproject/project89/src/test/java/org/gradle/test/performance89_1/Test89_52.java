package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_52 {
    private final Production89_52 production = new Production89_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}