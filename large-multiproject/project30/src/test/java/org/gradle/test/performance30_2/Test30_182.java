package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_182 {
    private final Production30_182 production = new Production30_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}