package org.gradle.test.performance29_4;

import static org.junit.Assert.*;

public class Test29_355 {
    private final Production29_355 production = new Production29_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}