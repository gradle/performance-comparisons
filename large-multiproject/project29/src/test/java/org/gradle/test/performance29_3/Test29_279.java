package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_279 {
    private final Production29_279 production = new Production29_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}