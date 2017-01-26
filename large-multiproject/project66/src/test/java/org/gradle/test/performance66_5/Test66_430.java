package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_430 {
    private final Production66_430 production = new Production66_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}