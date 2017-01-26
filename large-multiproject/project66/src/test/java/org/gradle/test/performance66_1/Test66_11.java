package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_11 {
    private final Production66_11 production = new Production66_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}