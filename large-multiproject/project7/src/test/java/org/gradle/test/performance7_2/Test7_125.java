package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_125 {
    private final Production7_125 production = new Production7_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}