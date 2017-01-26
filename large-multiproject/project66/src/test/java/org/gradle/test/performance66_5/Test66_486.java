package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_486 {
    private final Production66_486 production = new Production66_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}