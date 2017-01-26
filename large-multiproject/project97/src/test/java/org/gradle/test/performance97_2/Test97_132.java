package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_132 {
    private final Production97_132 production = new Production97_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}