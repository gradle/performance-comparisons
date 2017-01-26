package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_113 {
    private final Production66_113 production = new Production66_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}