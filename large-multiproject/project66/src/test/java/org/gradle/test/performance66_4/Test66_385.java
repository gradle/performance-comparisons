package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_385 {
    private final Production66_385 production = new Production66_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}