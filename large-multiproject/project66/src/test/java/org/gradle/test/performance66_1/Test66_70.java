package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_70 {
    private final Production66_70 production = new Production66_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}