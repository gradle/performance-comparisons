package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_385 {
    private final Production29_385 production = new Production29_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}