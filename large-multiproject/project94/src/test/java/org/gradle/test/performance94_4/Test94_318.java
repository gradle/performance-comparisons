package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_318 {
    private final Production94_318 production = new Production94_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}