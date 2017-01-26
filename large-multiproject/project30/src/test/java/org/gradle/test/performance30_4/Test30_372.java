package org.gradle.test.performance30_4;

import static org.junit.Assert.*;

public class Test30_372 {
    private final Production30_372 production = new Production30_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}