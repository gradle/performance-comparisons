package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_302 {
    private final Production94_302 production = new Production94_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}