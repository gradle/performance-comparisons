package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_453 {
    private final Production66_453 production = new Production66_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}