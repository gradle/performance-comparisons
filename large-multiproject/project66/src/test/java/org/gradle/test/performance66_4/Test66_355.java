package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_355 {
    private final Production66_355 production = new Production66_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}