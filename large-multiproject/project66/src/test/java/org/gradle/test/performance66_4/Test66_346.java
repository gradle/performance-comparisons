package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_346 {
    private final Production66_346 production = new Production66_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}