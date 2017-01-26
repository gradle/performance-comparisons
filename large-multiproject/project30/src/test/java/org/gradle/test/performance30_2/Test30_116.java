package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_116 {
    private final Production30_116 production = new Production30_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}