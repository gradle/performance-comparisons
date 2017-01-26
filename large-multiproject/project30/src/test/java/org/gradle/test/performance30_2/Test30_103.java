package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_103 {
    private final Production30_103 production = new Production30_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}