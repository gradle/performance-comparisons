package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_217 {
    private final Production66_217 production = new Production66_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}