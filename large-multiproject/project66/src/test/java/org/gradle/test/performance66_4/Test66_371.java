package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_371 {
    private final Production66_371 production = new Production66_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}