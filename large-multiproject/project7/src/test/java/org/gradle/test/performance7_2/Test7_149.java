package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_149 {
    private final Production7_149 production = new Production7_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}