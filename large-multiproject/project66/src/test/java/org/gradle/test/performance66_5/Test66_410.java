package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_410 {
    private final Production66_410 production = new Production66_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}