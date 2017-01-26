package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_463 {
    private final Production94_463 production = new Production94_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}