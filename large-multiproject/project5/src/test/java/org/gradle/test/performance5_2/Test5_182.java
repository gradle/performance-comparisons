package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_182 {
    private final Production5_182 production = new Production5_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}