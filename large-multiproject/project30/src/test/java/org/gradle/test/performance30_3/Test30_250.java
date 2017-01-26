package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_250 {
    private final Production30_250 production = new Production30_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}