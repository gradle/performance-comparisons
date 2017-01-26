package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_328 {
    private final Production66_328 production = new Production66_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}