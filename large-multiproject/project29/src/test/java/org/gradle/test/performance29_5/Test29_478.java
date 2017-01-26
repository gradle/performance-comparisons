package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_478 {
    private final Production29_478 production = new Production29_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}