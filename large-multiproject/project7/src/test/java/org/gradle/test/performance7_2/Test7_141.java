package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_141 {
    private final Production7_141 production = new Production7_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}