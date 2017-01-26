package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_292 {
    private final Production66_292 production = new Production66_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}