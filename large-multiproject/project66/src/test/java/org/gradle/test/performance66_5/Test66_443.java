package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_443 {
    private final Production66_443 production = new Production66_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}