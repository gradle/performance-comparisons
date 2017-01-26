package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_279 {
    private final Production66_279 production = new Production66_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}