package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_454 {
    private final Production66_454 production = new Production66_454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}