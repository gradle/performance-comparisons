package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_50 {
    private final Production29_50 production = new Production29_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}