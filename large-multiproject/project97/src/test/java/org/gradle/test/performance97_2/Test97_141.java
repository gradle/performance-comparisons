package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_141 {
    private final Production97_141 production = new Production97_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}