package org.gradle.test.performance66_3;

import static org.junit.Assert.*;

public class Test66_271 {
    private final Production66_271 production = new Production66_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}