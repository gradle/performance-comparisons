package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_153 {
    private final Production66_153 production = new Production66_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}