package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_311 {
    private final Production30_311 production = new Production30_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}