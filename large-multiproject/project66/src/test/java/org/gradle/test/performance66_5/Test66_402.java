package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_402 {
    private final Production66_402 production = new Production66_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}