package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_33 {
    private final Production66_33 production = new Production66_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}