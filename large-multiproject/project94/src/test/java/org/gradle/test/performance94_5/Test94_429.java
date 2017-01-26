package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_429 {
    private final Production94_429 production = new Production94_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}