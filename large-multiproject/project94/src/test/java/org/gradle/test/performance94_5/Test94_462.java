package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_462 {
    private final Production94_462 production = new Production94_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}