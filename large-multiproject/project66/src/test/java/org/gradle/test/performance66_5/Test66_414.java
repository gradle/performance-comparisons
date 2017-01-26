package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_414 {
    private final Production66_414 production = new Production66_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}