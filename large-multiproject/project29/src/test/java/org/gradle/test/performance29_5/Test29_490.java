package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_490 {
    private final Production29_490 production = new Production29_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}