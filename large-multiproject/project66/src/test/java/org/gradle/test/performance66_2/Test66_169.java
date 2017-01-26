package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_169 {
    private final Production66_169 production = new Production66_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}