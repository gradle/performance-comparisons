package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_171 {
    private final Production89_171 production = new Production89_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}