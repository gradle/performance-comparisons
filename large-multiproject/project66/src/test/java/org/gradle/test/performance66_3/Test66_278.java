package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_278 {
    private final Production66_278 production = new Production66_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}