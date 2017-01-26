package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_192 {
    private final Production89_192 production = new Production89_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}