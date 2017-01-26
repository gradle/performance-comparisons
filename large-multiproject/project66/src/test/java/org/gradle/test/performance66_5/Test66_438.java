package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_438 {
    private final Production66_438 production = new Production66_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}