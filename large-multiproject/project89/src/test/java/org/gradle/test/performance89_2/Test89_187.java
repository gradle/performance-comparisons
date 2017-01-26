package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_187 {
    private final Production89_187 production = new Production89_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}