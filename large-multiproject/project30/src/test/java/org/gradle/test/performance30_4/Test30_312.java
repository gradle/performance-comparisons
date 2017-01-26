package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_312 {
    private final Production30_312 production = new Production30_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}