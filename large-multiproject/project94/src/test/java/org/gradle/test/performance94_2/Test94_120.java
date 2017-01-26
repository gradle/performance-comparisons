package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_120 {
    private final Production94_120 production = new Production94_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}