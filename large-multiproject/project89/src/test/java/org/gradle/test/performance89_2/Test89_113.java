package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_113 {
    private final Production89_113 production = new Production89_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}