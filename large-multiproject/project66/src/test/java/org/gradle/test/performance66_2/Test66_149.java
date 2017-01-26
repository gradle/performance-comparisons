package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_149 {
    private final Production66_149 production = new Production66_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}