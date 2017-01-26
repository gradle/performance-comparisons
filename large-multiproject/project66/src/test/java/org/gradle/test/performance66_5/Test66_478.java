package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_478 {
    private final Production66_478 production = new Production66_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}