package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_144 {
    private final Production34_144 production = new Production34_144("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}