package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_363 {
    private final Production94_363 production = new Production94_363("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}