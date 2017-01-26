package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_397 {
    private final Production29_397 production = new Production29_397("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}