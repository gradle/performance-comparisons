package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_371 {
    private final Production94_371 production = new Production94_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}