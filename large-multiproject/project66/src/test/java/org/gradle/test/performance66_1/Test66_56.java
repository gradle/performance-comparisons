package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_56 {
    private final Production66_56 production = new Production66_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}