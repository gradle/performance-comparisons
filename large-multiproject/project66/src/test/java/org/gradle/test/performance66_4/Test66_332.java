package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_332 {
    private final Production66_332 production = new Production66_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}