package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_292 {
    private final Production97_292 production = new Production97_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}