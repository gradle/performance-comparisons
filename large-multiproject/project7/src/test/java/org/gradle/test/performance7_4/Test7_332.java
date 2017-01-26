package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_332 {
    private final Production7_332 production = new Production7_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}