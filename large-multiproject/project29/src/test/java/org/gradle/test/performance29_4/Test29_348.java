package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_348 {
    private final Production29_348 production = new Production29_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}