package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_454 {
    private final Production95_454 production = new Production95_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}