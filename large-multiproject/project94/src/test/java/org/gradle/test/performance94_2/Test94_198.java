package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_198 {
    private final Production94_198 production = new Production94_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}