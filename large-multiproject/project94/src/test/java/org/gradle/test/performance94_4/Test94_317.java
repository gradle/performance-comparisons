package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_317 {
    private final Production94_317 production = new Production94_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}