package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_20 {
    private final Production94_20 production = new Production94_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}