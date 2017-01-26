package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_117 {
    private final Production66_117 production = new Production66_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}