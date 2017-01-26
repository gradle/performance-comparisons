package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_372 {
    private final Production7_372 production = new Production7_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}