package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_30 {
    private final Production66_30 production = new Production66_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}