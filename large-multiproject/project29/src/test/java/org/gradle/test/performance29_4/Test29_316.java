package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_316 {
    private final Production29_316 production = new Production29_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}