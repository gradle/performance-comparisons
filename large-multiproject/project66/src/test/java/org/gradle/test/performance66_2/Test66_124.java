package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_124 {
    private final Production66_124 production = new Production66_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}