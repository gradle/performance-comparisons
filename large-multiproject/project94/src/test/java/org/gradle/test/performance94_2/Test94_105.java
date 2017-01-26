package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_105 {
    private final Production94_105 production = new Production94_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}