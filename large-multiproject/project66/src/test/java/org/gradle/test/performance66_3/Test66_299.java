package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_299 {
    private final Production66_299 production = new Production66_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}