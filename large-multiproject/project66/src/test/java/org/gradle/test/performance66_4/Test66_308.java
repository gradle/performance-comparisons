package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_308 {
    private final Production66_308 production = new Production66_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}