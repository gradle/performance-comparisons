package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_182 {
    private final Production47_182 production = new Production47_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}