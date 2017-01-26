package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_179 {
    private final Production66_179 production = new Production66_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}