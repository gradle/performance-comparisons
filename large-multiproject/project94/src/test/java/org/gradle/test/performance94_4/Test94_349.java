package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_349 {
    private final Production94_349 production = new Production94_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}