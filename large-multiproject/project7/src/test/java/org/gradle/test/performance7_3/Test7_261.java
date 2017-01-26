package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_261 {
    private final Production7_261 production = new Production7_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}