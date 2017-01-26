package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_101 {
    private final Production97_101 production = new Production97_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}