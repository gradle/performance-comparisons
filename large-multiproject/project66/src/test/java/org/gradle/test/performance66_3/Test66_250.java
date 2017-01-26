package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_250 {
    private final Production66_250 production = new Production66_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}