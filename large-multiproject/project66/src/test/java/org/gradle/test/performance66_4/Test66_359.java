package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_359 {
    private final Production66_359 production = new Production66_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}