package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_358 {
    private final Production80_358 production = new Production80_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}