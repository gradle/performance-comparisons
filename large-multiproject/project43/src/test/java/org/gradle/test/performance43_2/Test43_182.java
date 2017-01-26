package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_182 {
    private final Production43_182 production = new Production43_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}