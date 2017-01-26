package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_346 {
    private final Production29_346 production = new Production29_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}