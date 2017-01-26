package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_408 {
    private final Production66_408 production = new Production66_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}