package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_185 {
    private final Production66_185 production = new Production66_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}