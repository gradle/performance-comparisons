package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_213 {
    private final Production94_213 production = new Production94_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}