package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_482 {
    private final Production66_482 production = new Production66_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}