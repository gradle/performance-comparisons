package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_70 {
    private final Production89_70 production = new Production89_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}