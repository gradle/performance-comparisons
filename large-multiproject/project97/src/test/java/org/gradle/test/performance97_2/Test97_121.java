package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_121 {
    private final Production97_121 production = new Production97_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}