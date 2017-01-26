package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_491 {
    private final Production66_491 production = new Production66_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}