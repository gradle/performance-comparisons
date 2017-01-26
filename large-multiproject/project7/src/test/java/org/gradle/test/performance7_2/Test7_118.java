package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_118 {
    private final Production7_118 production = new Production7_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}