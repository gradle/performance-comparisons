package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_298 {
    private final Production66_298 production = new Production66_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}