package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_389 {
    private final Production7_389 production = new Production7_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}