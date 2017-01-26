package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_121 {
    private final Production30_121 production = new Production30_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}