package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_206 {
    private final Production66_206 production = new Production66_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}