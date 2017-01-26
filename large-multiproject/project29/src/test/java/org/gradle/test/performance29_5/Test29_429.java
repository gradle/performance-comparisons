package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_429 {
    private final Production29_429 production = new Production29_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}