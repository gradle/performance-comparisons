package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_184 {
    private final Production66_184 production = new Production66_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}