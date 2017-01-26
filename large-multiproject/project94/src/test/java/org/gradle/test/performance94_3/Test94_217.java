package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_217 {
    private final Production94_217 production = new Production94_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}