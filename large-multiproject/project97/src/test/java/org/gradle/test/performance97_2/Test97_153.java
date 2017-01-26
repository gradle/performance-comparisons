package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_153 {
    private final Production97_153 production = new Production97_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}