package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_272 {
    private final Production66_272 production = new Production66_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}