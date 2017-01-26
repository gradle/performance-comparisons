package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_223 {
    private final Production66_223 production = new Production66_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}