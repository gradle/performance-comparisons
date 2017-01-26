package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_115 {
    private final Production89_115 production = new Production89_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}