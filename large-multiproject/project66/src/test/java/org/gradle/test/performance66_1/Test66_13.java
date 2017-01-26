package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_13 {
    private final Production66_13 production = new Production66_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}