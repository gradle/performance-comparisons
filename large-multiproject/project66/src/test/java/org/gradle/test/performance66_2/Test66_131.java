package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_131 {
    private final Production66_131 production = new Production66_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}