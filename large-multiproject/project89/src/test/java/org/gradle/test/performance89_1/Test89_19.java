package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_19 {
    private final Production89_19 production = new Production89_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}