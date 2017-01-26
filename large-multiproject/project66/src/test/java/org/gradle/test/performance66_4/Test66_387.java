package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_387 {
    private final Production66_387 production = new Production66_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}