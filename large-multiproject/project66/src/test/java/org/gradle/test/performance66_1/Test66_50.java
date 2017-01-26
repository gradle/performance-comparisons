package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_50 {
    private final Production66_50 production = new Production66_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}