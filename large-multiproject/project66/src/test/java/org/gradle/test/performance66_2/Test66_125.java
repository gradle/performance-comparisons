package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_125 {
    private final Production66_125 production = new Production66_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}