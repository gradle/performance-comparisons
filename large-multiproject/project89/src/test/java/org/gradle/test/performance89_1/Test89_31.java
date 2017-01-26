package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_31 {
    private final Production89_31 production = new Production89_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}