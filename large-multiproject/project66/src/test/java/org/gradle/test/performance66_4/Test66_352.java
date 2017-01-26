package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_352 {
    private final Production66_352 production = new Production66_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}