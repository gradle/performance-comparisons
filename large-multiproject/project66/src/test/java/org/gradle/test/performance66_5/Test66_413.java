package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_413 {
    private final Production66_413 production = new Production66_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}