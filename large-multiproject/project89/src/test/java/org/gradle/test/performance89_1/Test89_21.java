package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_21 {
    private final Production89_21 production = new Production89_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}