package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_319 {
    private final Production66_319 production = new Production66_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}