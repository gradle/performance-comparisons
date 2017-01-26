package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_321 {
    private final Production66_321 production = new Production66_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}