package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_122 {
    private final Production30_122 production = new Production30_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}