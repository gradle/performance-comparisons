package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_135 {
    private final Production94_135 production = new Production94_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}