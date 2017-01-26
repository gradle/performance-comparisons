package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_194 {
    private final Production66_194 production = new Production66_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}