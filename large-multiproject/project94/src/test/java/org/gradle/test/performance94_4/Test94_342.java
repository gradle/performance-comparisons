package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_342 {
    private final Production94_342 production = new Production94_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}