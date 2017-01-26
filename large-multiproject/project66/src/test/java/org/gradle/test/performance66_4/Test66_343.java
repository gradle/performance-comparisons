package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_343 {
    private final Production66_343 production = new Production66_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}