package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_24 {
    private final Production89_24 production = new Production89_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}