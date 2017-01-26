package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_245 {
    private final Production29_245 production = new Production29_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}