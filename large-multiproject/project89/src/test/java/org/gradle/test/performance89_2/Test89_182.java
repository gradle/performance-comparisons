package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_182 {
    private final Production89_182 production = new Production89_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}