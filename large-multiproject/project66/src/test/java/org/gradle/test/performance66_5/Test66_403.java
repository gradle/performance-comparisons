package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_403 {
    private final Production66_403 production = new Production66_403("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}