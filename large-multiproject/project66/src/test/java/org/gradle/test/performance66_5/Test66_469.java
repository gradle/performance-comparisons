package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_469 {
    private final Production66_469 production = new Production66_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}