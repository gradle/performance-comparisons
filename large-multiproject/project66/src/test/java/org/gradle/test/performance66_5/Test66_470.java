package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_470 {
    private final Production66_470 production = new Production66_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}