package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_262 {
    private final Production29_262 production = new Production29_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}