package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_493 {
    private final Production66_493 production = new Production66_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}