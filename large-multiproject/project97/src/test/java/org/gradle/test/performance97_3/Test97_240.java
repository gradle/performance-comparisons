package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_240 {
    private final Production97_240 production = new Production97_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}