package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_210 {
    private final Production89_210 production = new Production89_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}