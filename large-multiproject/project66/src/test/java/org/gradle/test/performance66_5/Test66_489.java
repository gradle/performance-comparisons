package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_489 {
    private final Production66_489 production = new Production66_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}