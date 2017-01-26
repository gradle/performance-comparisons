package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_141 {
    private final Production66_141 production = new Production66_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}