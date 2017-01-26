package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_448 {
    private final Production29_448 production = new Production29_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}