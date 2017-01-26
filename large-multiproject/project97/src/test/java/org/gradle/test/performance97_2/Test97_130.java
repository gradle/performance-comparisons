package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_130 {
    private final Production97_130 production = new Production97_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}