package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_451 {
    private final Production29_451 production = new Production29_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}