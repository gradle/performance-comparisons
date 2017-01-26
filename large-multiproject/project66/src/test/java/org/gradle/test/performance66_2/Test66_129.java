package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_129 {
    private final Production66_129 production = new Production66_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}