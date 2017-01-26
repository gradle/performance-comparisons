package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_160 {
    private final Production30_160 production = new Production30_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}