package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_359 {
    private final Production29_359 production = new Production29_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}