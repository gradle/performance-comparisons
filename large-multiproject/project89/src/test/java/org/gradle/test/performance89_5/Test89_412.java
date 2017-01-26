package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_412 {
    private final Production89_412 production = new Production89_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}