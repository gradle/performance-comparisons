package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_407 {
    private final Production66_407 production = new Production66_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}