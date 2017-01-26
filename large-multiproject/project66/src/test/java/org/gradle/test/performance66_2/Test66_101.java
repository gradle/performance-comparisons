package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_101 {
    private final Production66_101 production = new Production66_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}