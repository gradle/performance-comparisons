package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_137 {
    private final Production94_137 production = new Production94_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}