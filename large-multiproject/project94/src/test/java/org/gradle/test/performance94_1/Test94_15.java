package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_15 {
    private final Production94_15 production = new Production94_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}