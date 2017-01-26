package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_182 {
    private final Production20_182 production = new Production20_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}