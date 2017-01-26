package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_420 {
    private final Production7_420 production = new Production7_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}