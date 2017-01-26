package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_434 {
    private final Production66_434 production = new Production66_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}