package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_120 {
    private final Production30_120 production = new Production30_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}