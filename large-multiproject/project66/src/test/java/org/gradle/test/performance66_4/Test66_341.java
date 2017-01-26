package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_341 {
    private final Production66_341 production = new Production66_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}