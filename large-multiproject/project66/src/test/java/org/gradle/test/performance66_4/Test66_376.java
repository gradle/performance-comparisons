package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_376 {
    private final Production66_376 production = new Production66_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}