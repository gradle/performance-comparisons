package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_327 {
    private final Production66_327 production = new Production66_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}