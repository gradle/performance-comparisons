package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_182 {
    private final Production84_182 production = new Production84_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}