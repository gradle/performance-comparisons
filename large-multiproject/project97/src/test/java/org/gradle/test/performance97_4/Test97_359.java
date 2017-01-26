package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_359 {
    private final Production97_359 production = new Production97_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}