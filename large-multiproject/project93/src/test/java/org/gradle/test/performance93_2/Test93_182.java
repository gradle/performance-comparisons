package org.gradle.test.performance93_2;

import static org.junit.Assert.*;

public class Test93_182 {
    private final Production93_182 production = new Production93_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}