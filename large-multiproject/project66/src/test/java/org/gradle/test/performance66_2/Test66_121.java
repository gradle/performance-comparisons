package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_121 {
    private final Production66_121 production = new Production66_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}