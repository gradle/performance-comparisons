package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_352 {
    private final Production94_352 production = new Production94_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}