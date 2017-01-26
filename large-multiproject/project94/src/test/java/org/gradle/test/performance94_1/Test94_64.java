package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_64 {
    private final Production94_64 production = new Production94_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}