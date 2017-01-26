package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_256 {
    private final Production66_256 production = new Production66_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}