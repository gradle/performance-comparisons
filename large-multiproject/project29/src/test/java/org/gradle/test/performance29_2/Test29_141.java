package org.gradle.test.performance29_2;

import static org.junit.Assert.*;

public class Test29_141 {
    private final Production29_141 production = new Production29_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}