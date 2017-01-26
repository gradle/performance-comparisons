package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_333 {
    private final Production89_333 production = new Production89_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}