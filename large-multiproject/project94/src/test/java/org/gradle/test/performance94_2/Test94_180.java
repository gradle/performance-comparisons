package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_180 {
    private final Production94_180 production = new Production94_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}