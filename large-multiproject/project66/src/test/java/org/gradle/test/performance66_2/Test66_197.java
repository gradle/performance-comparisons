package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_197 {
    private final Production66_197 production = new Production66_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}