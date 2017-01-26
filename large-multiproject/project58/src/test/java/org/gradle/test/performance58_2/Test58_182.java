package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_182 {
    private final Production58_182 production = new Production58_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}