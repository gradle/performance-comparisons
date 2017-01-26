package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_211 {
    private final Production66_211 production = new Production66_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}