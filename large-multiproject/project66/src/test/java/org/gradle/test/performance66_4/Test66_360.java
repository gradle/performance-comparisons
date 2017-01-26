package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_360 {
    private final Production66_360 production = new Production66_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}