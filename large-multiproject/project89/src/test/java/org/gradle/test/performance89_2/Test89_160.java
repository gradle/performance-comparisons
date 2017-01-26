package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_160 {
    private final Production89_160 production = new Production89_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}