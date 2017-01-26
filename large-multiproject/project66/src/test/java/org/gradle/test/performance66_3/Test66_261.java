package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_261 {
    private final Production66_261 production = new Production66_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}