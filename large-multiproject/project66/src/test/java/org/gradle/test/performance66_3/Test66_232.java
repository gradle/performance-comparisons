package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_232 {
    private final Production66_232 production = new Production66_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}