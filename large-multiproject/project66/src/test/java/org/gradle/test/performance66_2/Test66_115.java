package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_115 {
    private final Production66_115 production = new Production66_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}