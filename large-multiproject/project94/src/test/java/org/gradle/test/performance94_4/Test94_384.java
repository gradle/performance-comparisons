package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_384 {
    private final Production94_384 production = new Production94_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}