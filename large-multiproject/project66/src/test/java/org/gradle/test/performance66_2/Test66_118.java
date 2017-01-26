package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_118 {
    private final Production66_118 production = new Production66_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}