package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_132 {
    private final Production66_132 production = new Production66_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}