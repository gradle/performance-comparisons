package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_236 {
    private final Production94_236 production = new Production94_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}