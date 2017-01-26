package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_311 {
    private final Production66_311 production = new Production66_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}