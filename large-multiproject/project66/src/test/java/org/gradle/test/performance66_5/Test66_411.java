package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_411 {
    private final Production66_411 production = new Production66_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}