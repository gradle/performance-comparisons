package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_245 {
    private final Production66_245 production = new Production66_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}