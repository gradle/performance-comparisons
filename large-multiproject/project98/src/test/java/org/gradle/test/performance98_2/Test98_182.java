package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_182 {
    private final Production98_182 production = new Production98_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}