package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_375 {
    private final Production66_375 production = new Production66_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}