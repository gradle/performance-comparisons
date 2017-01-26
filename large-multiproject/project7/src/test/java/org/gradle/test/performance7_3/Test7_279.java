package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_279 {
    private final Production7_279 production = new Production7_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}