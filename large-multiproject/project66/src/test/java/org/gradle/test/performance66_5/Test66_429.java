package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_429 {
    private final Production66_429 production = new Production66_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}