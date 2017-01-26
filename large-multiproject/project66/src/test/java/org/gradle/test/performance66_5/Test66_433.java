package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_433 {
    private final Production66_433 production = new Production66_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}