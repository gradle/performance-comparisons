package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_311 {
    private final Production7_311 production = new Production7_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}