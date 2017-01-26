package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_345 {
    private final Production94_345 production = new Production94_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}