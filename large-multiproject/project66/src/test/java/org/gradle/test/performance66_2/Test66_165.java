package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_165 {
    private final Production66_165 production = new Production66_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}