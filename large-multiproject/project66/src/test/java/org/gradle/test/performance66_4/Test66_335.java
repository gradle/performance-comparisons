package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_335 {
    private final Production66_335 production = new Production66_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}