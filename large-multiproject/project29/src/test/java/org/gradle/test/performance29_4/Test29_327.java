package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_327 {
    private final Production29_327 production = new Production29_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}