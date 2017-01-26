package org.gradle.test.performance66_1;

import static org.junit.Assert.*;

public class Test66_24 {
    private final Production66_24 production = new Production66_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}