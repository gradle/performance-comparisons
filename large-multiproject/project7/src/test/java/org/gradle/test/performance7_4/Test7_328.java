package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_328 {
    private final Production7_328 production = new Production7_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}