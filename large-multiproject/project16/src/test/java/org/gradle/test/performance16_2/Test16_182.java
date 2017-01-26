package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_182 {
    private final Production16_182 production = new Production16_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}