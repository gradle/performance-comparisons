package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_121 {
    private final Production7_121 production = new Production7_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}