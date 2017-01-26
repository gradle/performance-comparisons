package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_108 {
    private final Production66_108 production = new Production66_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}