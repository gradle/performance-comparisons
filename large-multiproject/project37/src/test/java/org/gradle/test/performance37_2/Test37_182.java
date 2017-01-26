package org.gradle.test.performance37_2;

import static org.junit.Assert.*;

public class Test37_182 {
    private final Production37_182 production = new Production37_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}