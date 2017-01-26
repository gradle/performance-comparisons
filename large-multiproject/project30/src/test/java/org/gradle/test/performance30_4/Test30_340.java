package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_340 {
    private final Production30_340 production = new Production30_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}