package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_284 {
    private final Production7_284 production = new Production7_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}