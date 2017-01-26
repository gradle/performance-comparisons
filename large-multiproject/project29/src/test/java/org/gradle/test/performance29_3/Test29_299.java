package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_299 {
    private final Production29_299 production = new Production29_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}