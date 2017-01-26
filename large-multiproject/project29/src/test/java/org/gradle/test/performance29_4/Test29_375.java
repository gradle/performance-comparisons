package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_375 {
    private final Production29_375 production = new Production29_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}