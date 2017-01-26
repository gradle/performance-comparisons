package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_130 {
    private final Production66_130 production = new Production66_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}