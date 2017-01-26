package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_160 {
    private final Production7_160 production = new Production7_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}