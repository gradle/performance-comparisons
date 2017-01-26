package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_402 {
    private final Production29_402 production = new Production29_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}