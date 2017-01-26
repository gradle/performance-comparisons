package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_240 {
    private final Production66_240 production = new Production66_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}