package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_430 {
    private final Production29_430 production = new Production29_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}