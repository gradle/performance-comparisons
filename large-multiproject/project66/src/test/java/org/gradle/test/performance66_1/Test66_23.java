package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_23 {
    private final Production66_23 production = new Production66_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}