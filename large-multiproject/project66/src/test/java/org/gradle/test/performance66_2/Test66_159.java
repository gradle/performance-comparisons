package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_159 {
    private final Production66_159 production = new Production66_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}