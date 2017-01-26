package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_342 {
    private final Production66_342 production = new Production66_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}