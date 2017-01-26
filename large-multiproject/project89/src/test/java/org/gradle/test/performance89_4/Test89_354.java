package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_354 {
    private final Production89_354 production = new Production89_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}