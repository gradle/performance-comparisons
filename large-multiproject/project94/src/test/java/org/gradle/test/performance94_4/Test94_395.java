package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_395 {
    private final Production94_395 production = new Production94_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}