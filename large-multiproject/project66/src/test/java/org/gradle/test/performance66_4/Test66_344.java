package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_344 {
    private final Production66_344 production = new Production66_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}