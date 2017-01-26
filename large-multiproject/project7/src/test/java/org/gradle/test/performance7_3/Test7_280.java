package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_280 {
    private final Production7_280 production = new Production7_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}