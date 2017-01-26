package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_487 {
    private final Production66_487 production = new Production66_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}