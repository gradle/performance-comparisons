package org.gradle.test.performance30_1;

import static org.junit.Assert.*;

public class Test30_16 {
    private final Production30_16 production = new Production30_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}