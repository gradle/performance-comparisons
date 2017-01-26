package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_472 {
    private final Production66_472 production = new Production66_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}