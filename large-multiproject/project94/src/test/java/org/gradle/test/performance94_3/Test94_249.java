package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_249 {
    private final Production94_249 production = new Production94_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}