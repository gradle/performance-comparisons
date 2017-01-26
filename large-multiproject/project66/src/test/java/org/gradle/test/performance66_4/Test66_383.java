package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_383 {
    private final Production66_383 production = new Production66_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}