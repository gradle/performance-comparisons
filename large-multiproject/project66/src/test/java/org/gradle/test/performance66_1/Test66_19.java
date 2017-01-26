package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_19 {
    private final Production66_19 production = new Production66_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}