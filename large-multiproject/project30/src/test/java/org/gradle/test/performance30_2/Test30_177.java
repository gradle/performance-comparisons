package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_177 {
    private final Production30_177 production = new Production30_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}