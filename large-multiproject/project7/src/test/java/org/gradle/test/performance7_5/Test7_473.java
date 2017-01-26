package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_473 {
    private final Production7_473 production = new Production7_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}