package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_182 {
    private final Production4_182 production = new Production4_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}