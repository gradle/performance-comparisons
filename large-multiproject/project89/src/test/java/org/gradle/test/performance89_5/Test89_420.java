package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_420 {
    private final Production89_420 production = new Production89_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}