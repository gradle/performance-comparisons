package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_248 {
    private final Production66_248 production = new Production66_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}