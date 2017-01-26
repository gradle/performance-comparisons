package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_115 {
    private final Production7_115 production = new Production7_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}