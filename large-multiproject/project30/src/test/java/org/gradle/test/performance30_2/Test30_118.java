package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_118 {
    private final Production30_118 production = new Production30_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}