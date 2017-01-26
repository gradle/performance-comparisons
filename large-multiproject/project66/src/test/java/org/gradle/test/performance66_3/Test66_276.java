package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_276 {
    private final Production66_276 production = new Production66_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}