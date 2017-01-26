package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_375 {
    private final Production97_375 production = new Production97_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}