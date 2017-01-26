package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_348 {
    private final Production66_348 production = new Production66_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}