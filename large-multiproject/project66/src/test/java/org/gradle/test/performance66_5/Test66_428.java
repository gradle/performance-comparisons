package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_428 {
    private final Production66_428 production = new Production66_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}