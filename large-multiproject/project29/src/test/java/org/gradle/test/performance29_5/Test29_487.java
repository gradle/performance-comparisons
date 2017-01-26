package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_487 {
    private final Production29_487 production = new Production29_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}