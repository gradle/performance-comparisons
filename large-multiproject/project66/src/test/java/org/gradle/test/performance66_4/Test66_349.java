package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_349 {
    private final Production66_349 production = new Production66_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}