package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_182 {
    private final Production86_182 production = new Production86_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}