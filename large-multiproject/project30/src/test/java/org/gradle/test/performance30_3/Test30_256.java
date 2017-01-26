package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_256 {
    private final Production30_256 production = new Production30_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}