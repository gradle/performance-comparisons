package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_472 {
    private final Production89_472 production = new Production89_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}