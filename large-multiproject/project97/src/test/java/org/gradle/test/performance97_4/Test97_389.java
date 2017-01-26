package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_389 {
    private final Production97_389 production = new Production97_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}