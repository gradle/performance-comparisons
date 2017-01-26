package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_493 {
    private final Production29_493 production = new Production29_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}