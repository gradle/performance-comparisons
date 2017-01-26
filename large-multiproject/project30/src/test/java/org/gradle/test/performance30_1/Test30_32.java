package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_32 {
    private final Production30_32 production = new Production30_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}