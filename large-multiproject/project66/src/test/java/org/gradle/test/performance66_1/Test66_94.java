package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_94 {
    private final Production66_94 production = new Production66_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}