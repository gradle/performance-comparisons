package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_236 {
    private final Production66_236 production = new Production66_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}