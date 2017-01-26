package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_368 {
    private final Production66_368 production = new Production66_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}