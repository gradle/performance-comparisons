package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_170 {
    private final Production66_170 production = new Production66_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}